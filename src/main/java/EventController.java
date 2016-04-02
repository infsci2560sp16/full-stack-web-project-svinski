
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Document
import org.w3c.dom.DocumentType
import org.w3c.dom.*;
import static spark.Spark.get;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah's Laptop
 */
public class EventController {
    
    public EventController(){
       
      get("/eventlist", (req, res) -> {
        
       Map<String, Object> eventData = new HashMap<>();
                
	File fXmlFile = new File("xml/eventlist.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = (Document) dBuilder.parse(fXmlFile);
			
	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();

	NodeList nList = doc.getElementsByTagName("event");
			


	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                String eventname = getElementsByTagName("eventname").item(0).getTextContent());
		String date = getElementsByTagName("date").item(0).getTextContent());
                String location = getElementsByTagName("location").item(0).getTextContent());
                String starttime = getElementsByTagName("starttime").item(0).getTextContent());
                String endtime = getElementsByTagName("endtime").item(0).getTextContent());
                String description = getElementsByTagName("description").item(0).getTextContent());
                    
                    
		eventData.put("eventname", eventname);
                eventData.put("date", date);
                eventData.put("location", location);
                eventData.put("start", starttime);
                eventData.put("end", endtime);
                eventData.put("description", description);
                
		}
	}
   
                   
                
                
                Gson gson = new Gson();
                return gson.toJson(eventData);
               /* 
            	
                
                Map<String, Object> userData = new HashMap<>();
                
                Gson gson = new Gson();                
                return gson.toJson(userData);*/
            });
        

         /*}catch(Exception e){
            final JPanel panel = new JPanel();

        JOptionPane.showMessageDialog(panel, "Could not add user.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}*/
}
}
