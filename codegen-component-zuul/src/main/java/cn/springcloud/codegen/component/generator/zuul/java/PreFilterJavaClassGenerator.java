package cn.springcloud.codegen.component.generator.zuul.java;


import com.nepxion.skeleton.engine.constant.SkeletonConstant;
import com.nepxion.skeleton.engine.context.SkeletonContext;
import com.nepxion.skeleton.engine.generator.SkeletonJavaGenerator;
import com.nepxion.skeleton.engine.property.SkeletonProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent.
 * @createdOn 2018/01/11 23:42
 */
public class PreFilterJavaClassGenerator extends SkeletonJavaGenerator {
    public PreFilterJavaClassGenerator(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties) {
        super(skeletonContext.clone("zuul", PreFilterJavaClassGenerator.class), skeletonProperties);
    }

    @Override
    protected String getPackage(){
        return super.getPackage() + ".filter";
    }

    @Override
    protected String getClassName() {
        return "PreFilter";
    }

    @Override
    protected boolean isMainCode() {
        return true;
    }

    @Override
    protected String getTemplateName() {
        return "ZuulFilter.java.template";
    }

    @Override
    protected Object getDataModel() {
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put(SkeletonConstant.PACKAGE, getPackage());
        dataModel.put("className", getClassName());
        dataModel.put("filterType", "pre");
        dataModel.put("explanation", "在请求被路由之前调用");
        return dataModel;
    }
}