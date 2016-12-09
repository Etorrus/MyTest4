package com.etorrus.dao;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * будет содержать всего два метода:
 * staffToXML() для сохранения объекта Java в XML-представление и
 * XMLToStaff() для получения готового объекта из XML-файла.
 */
public class JaxbParser {
    public void staffToXML(File file, Object object)
    {
        try {

            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller m = context.createMarshaller();
            //следующая строчка делает так чтоб Xml был не в одну строку
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(object, file);
        } catch (JAXBException ex) {
            Logger.getLogger(JaxbParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object XMLToStaff(File file, Class c)
    {
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller u = context.createUnmarshaller();
            return u.unmarshal(file);
        } catch (JAXBException ex) {
            Logger.getLogger(JaxbParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
