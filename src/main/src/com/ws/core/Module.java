package com.ws.core;


import com.ws.common.plugs.ShiroSessionProvider;
import org.beetl.ext.nutz.BeetlViewMaker;
import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.ComboIocProvider;


/**
 * Created by ws on 2018/6/12.
 */
@Modules(scanPackage = true, packages = "com.ws")
@Ok("json:full")
@Fail("http:500")
@IocBy(type = ComboIocProvider.class, args = {"*json", "config/ioc/", "*anno", "com.ws",  "*tx",  "*async", })
//@Localization(value = "locales/", defaultLocalizationKey = "zh_CN")
@Encoding(input = "UTF-8", output = "UTF-8")
@Views({BeetlViewMaker.class})
@SetupBy(value = Setup.class)
//@ChainBy(args = "config/chain/nutzwk-mvc-chain.json")
@SessionBy(ShiroSessionProvider.class)
public class Module {
}
