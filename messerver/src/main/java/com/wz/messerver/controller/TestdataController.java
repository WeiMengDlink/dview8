//package com.wz.messerver.controller;
//
//import com.wz.messerver.dataobject.Testdata;
//import com.wz.messerver.service.TestdataService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/data")
//public class TestdataController {
//    @Autowired
//    private TestdataService testdataService;
//    @GetMapping("testdata")
//    private List<Testdata> queryData(){
//        return  testdataService.queryAllByName();
//    }
//}
