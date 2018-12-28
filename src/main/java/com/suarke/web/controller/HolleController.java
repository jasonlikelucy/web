/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HolleController
 * Author:   Jason
 * Date:     2018/12/28 0:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.suarke.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 52430
 * @create 2018/12/28
 * @since 1.0.0
 */
@RestController
public class HolleController
{

    @GetMapping("/hello")
    public String hello ()
    {
        return "hello world.";
    }
}