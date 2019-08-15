package com.qingcheng.controller.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.pojo.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: BaoJun
 * @Date: 2019/8/14 23:54
 * @Version: 1.0
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAll(){
        System.out.println(brandService.findAll());
        return brandService.findAll();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
