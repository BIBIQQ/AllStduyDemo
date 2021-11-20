package com.ff.controller;


import com.ff.domain.Dish;
import com.ff.domain.Result;
import com.ff.domain.ShoppingCart;
import com.ff.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 购物车 前端控制器
 * </p>
 *
 * @author 方某
 * @since 2021-11-20
 */
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService iShoppingCartService;

    /**
     * 查询用户购车商品
     * @param userid
     * @return
     */
    @GetMapping("/list/{userid}")
    Result findAllShopByUserId(HttpServletRequest request, @PathVariable Long userid){
        Result allShopByUserId = iShoppingCartService.findAllShopByUserId(userid);
        return allShopByUserId;
    }

    /**
     * 清空购物车商品 通过用户id
     * @param userid
     * @return
     */
    @GetMapping("/clean/{userid}")
    Result emptyShopByUserId(HttpServletRequest request,@PathVariable Long userid){
        Result result = iShoppingCartService.emptyShopByUserId(userid);
        return result;
    }

    /**
     * 添加商品
     * @param userid
     * @param ShoppingCart
     * @return
     */
    @PostMapping("/add/{userid}")
    Result addFoodByUserId(HttpServletRequest request,@PathVariable Long userid, @RequestBody ShoppingCart ShoppingCart){
        Result result = iShoppingCartService.addFoodByUserId(userid, ShoppingCart);
        return result;
    }

}

