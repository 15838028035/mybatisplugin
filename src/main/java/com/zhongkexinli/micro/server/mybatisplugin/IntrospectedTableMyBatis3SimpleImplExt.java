package com.zhongkexinli.micro.server.mybatisplugin;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3SimpleImpl;

public class IntrospectedTableMyBatis3SimpleImplExt extends IntrospectedTableMyBatis3SimpleImpl {

    @Override
    public List<GeneratedXmlFile> getGeneratedXmlFiles() {
        List<GeneratedXmlFile> answer = new ArrayList<GeneratedXmlFile>();

        if (xmlMapperGenerator != null) {
            Document document = xmlMapperGenerator.getDocument();
            boolean mergeable = false; // 新生成的XML文件究竟是追加(true)还是覆盖(false)
            if ("true".equalsIgnoreCase(context.getProperty("mergeable"))) {
                mergeable = true;
            }
            GeneratedXmlFile gxf = new GeneratedXmlFile(document, getMyBatis3XmlMapperFileName(),
                                                        getMyBatis3XmlMapperPackage(),
                                                        context.getSqlMapGeneratorConfiguration().getTargetProject(),
                                                        mergeable, context.getXmlFormatter());
            if (context.getPlugins().sqlMapGenerated(gxf, this)) {
                answer.add(gxf);
            }
        }

        return answer;
    }

}
