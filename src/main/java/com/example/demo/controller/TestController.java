package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.CustomerNode;
import com.example.demo.service.GraphService;
import com.sun.deploy.net.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @program: neo4j_demo
 * @description:
 * @author: 安少军
 * @create: 2022-09-20 15:38
 **/
@RestController
public class TestController {
    private static Logger logger= LoggerFactory.getLogger(TestController.class);
    @Autowired
    private GraphService graphService;
    //http://localhost:8989/swagger-ui.html
    @GetMapping("/t")
    public String t(){
        return "";
    }
    @PostMapping("/t2")
    public String t2(){
        return "";
    }

    @PostMapping(path = "/create")
    public Result addNode(
            @RequestParam(name = "name",defaultValue = "node1") String name,
            @RequestParam(name = "age",defaultValue = "0")Integer age,
            @RequestParam(name = "nameTo",defaultValue = "node2")String nameTo,
            @RequestParam(name = "remark",defaultValue = "朋友") String remark
    ){
        logger.info("添加节点");
        graphService.addNode(name,age,nameTo,remark);
        return Result.ok();
    }
    /**
     * 根据名字查找相关的所有节点
     * @param name
     */
    @GetMapping(path = "/find")
    public Result findNode(@RequestParam(name = "name",required = true) String name){
        logger.info("查找所有的节点"+name);
        List<CustomerNode> customerNodes=graphService.queryNodes(name);
        CustomerNode cn = graphService.findByName(name);
        logger.info("节点名 "+cn.getName()+"与节点 "+cn.getAge());
        logger.info(customerNodes.size()+" 返回的数据长度");
        for (CustomerNode customerNode: customerNodes) {
            logger.info("节点名 "+customerNode.getName()+"与节点 "+customerNode.getAge());
        }
        return Result.ok(customerNodes);
    }
    /**
     * 删除节点
     * @param id 节点ID，非必须，如果不提供，那么默认全删，否则删除相对应的id
     */
    @GetMapping(path = "/delete")
    public Result deleteNode( @RequestParam(name = "id",required = false)Long id, @RequestParam(name = "name",required = false) String name){
        if (id !=null){
            graphService.deleteNodeById(id);
        }else if(name !=null && id==null){
            graphService.deleteNodeByName(name);
        }else {
            graphService.delete();
        }
        return Result.ok();
    }

    /**
     * 根据节点ID，更新节点信息
     * @param id
     * @param name
     * @param age
     */
    @GetMapping(path = "/update")
    public Result updateNode( @RequestParam(name = "id",required = false) Long id,
            @RequestParam(name = "name",required = false) String name,
            @RequestParam(name = "age",required = false) Integer age ){
        logger.info("更新数据");
        graphService.updateNode(id,name,age);
        return Result.ok();
    }
}
