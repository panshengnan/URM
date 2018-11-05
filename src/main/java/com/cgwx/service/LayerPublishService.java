package com.cgwx.service;

import com.cgwx.aop.result.Result;
import net.sf.json.JSONObject;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.operation.TransformException;
import org.springframework.stereotype.Service;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@Service
public interface LayerPublishService {

    Result publishTifToGeoserver(JSONObject jsonObject) throws ParserConfigurationException, IOException;
    Result publishTif(String filePath, String nameSpace, String borderColor) throws IOException, FactoryException, TransformException;
}