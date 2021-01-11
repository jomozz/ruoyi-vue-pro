package cn.iocoder.dashboard.modules.system.convert.dept;

import cn.iocoder.dashboard.common.pojo.PageResult;
import cn.iocoder.dashboard.modules.system.controller.dept.vo.post.SysPostCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.dept.vo.post.SysPostRespVO;
import cn.iocoder.dashboard.modules.system.controller.dept.vo.post.SysPostSimpleRespVO;
import cn.iocoder.dashboard.modules.system.controller.dept.vo.post.SysPostUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.mysql.dataobject.dept.SysPostDO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SysPostConvert {

    SysPostConvert INSTANCE = Mappers.getMapper(SysPostConvert.class);

    List<SysPostSimpleRespVO> convertList02(List<SysPostDO> list);

    PageResult<SysPostRespVO> convertPage(PageResult<SysPostDO> page);

    SysPostRespVO convert(SysPostDO id);

    @Mapping(source = "records", target = "list")
    PageResult<SysPostDO> convertPage02(IPage<SysPostDO> page);

    SysPostDO convert(SysPostCreateReqVO bean);

    SysPostDO convert(SysPostUpdateReqVO reqVO);

}
