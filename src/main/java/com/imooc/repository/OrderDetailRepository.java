package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 
 * @类名称 OrderDetailRepository.java
 * @类描述 <pre></pre>
 * @作者  xingsfdz xingsfdz@163.com
 * @创建时间 2018年7月25日 上午1:11:08
 * @版本 1.00
 *
 * @修改记录
 * <pre>
 *     版本                       修改人 		修改日期 		 修改内容描述
 *     ----------------------------------------------
 *     1.00 	xingsfdz 	2018年7月25日             
 *     ----------------------------------------------
 * </pre>
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
