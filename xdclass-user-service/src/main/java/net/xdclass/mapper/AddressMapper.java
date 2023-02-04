package net.xdclass.mapper;

import net.xdclass.model.AddressDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 电商-公司收发货地址表 Mapper 接口
 * </p>
 *
 * @author Rain
 * @since 2023-02-04
 */
public interface AddressMapper extends BaseMapper<AddressDO> {

}
