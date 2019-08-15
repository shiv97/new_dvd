package example.Controller;


import example.dvdrentalservice.dvdrentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/aps")
public class dvdrentalController {

    @Autowired
    dvdrentalService DvdrentalService;



    @GetMapping("/getdata")
    public List<Map<String, Object>> getdata()
    {
        try{
            List<Map<String, Object>> data;
            data = DvdrentalService.getdata();
            System.out.println(data);
            return data;
        }catch(Exception e)
        {
            System.out.println("Exception");
            throw e;
        }

    }
   /* @PutMapping(path="/update")
    public List<Map<String, Object>> gdata()
    {
        return DvdrentalService.gdata();
    }*/
  /*  @GetMapping("/get_delete")
    public String deleteLicense()
    {
        List<Map<String, Object>> data;
        data = DvdrentalService.getdata();
        return DvdrentalService.deleteLicense();
    }
*/

}
