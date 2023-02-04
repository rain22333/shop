package net.xdclass.service;

import net.xdclass.model.AddressDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电商-公司收发货地址表 服务类
 * </p>
 *
 * @author Rain
 * @since 2023-02-04
 */
public interface AddressService {
    AddressDO detail(Long id);
}
