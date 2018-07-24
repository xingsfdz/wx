package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @类名称 SellerInfoRepository.java
 * @类描述 <pre></pre>
 * @作者  xingsfdz xingsfdz@163.com
 * @创建时间 2018年7月25日 上午1:11:28
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
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
