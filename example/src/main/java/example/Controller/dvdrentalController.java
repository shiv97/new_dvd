package example.Controller;


import example.dvdrentalservice.dvdrentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/aps")
public class dvdrentalController
{

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
    @PostMapping("/getdata")
            public List<Map<String,Object>> submitdata()
    {
        List<Map<String, Object>> dat;
        dat = DvdrentalService.getdata();
        System.out.println(dat);
        return dat;
    }
    /*@PostMapping("article")
    public ResponseEntity<Void> addArticle(@RequestBody ArticleInfo articleInfo, UriComponentsBuilder builder) {
        Article article = new Article();
        BeanUtils.copyProperties(articleInfo, article);
        boolean flag = articleService.addArticle(article);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);*/
    //@PostMapping("/getda")

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
