package com.imooc.utils;

import java.util.Random;

/**
 * Created by 廖师兄
 * 2017-06-11 19:12
 */
public class KeyUtil {

	/**
	 * 
	 * @方法名称 genUniqueKey
	 * @功能描述 <pre>生成唯一的主键 格式: 时间+随机数</pre>
	 * @作者    xingsfdz
	 * @创建时间 2018年7月25日 上午1:14:57
	 * @return
	 */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
