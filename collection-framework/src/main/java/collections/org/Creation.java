package collections.org;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Creation {

	private static final Logger logger = LogManager.getLogger(Creation.class);
    private static Scanner scan;

	public static void main(String[] args) 
    {
    	scan = new Scanner(System.in);
    	Customlist<Integer> list = new Customlist<Integer>();
    	logger.info("Initial list:");
    	logger.info(list);
        int noOfAdd=scan.nextInt();
        logger.info("enter elements:");
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=scan.nextInt();
        	list.add(adding);
        }
        logger.info("Total list after adding elements:");
        logger.info(list);
        logger.info("enter index to be removed");
        int removeElement;
        removeElement=scan.nextInt();
        list.remove(removeElement);
        logger.info("Total list after removing elements:"+list);
         

        logger.info("value at index 0 is "+ list.fetch(0));

        logger.info("value at index 1 is:"+list.fetch(1));
 
        //List Size
        logger.info("total size"+list.s());
    }
}
