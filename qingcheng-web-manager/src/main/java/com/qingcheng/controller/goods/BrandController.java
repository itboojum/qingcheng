package com.qingcheng.controller.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.entity.PageResult;
import com.qingcheng.entity.Result;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: BaoJun
 * @Date: 2019/8/14 23:54
 * @Version: 1.0
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference(check = false)
    private BrandService brandService;

    /**
     * 品牌列表
     * @return
     */
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        System.out.println(brandService.findAll());
        return brandService.findAll();
    }

    /**
     * 品牌分页列表
     * @return
     */
    @GetMapping("/findPage")
    public PageResult<Brand> findPage(int page, int size){
        return brandService.findPage(page, size);
    }

    /**
     * 品牌条件查询
     * @param searchMap
     * @return
     */
    @PostMapping("/findList")
    public List<Brand> findList(@RequestBody Map<String, Object> searchMap){
        return brandService.findList(searchMap);
    }

    /**
     * 品牌条件分页查询
     * @param searchMap
     * @param page
     * @param size
     * @return
     */
    @PostMapping("/findPage")
    public PageResult<Brand> findPage(@RequestBody Map<String, Object> searchMap, int page, int size){
        return brandService.findPage(searchMap, page, size);
    }

    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    @GetMapping("/findById")
    public Brand findById(Integer id){
        return brandService.findById(id);
    }

    /**
     * 品牌新增
     * @param brand
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody Brand brand){
        brandService.add(brand);
        return new Result();
    }

    /**
     * 品牌修改
     * @param brand
     * @return
     */
    @PostMapping("/update")
    public Result update(@RequestBody Brand brand){
        brandService.update(brand);
        return new Result();
    }

    /**
     * 品牌删除
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public Result delete(Integer id){
        int i = 1/0;
        brandService.delete(id);
        return new Result();
    }
}
