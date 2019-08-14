package example.dvdrentalservice;

//import antlr.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import example.repository.dvdrentalRepository;

import java.util.List;
import java.util.Map;

@Service
public class dvdrentalService {
    dvdrentalRepository DvdrentalRepository;

    @Autowired
    @Qualifier("mariaJdbcTemplate")
    private JdbcTemplate mariaJdbcTemplate;

    public List<Map<String, Object>> getdata(){
        try{
            List<Map<String, Object>> data;
            String query =DvdrentalRepository.display1;
            data = mariaJdbcTemplate.queryForList(query);
            System.out.println(data);
            return data;
        }
        catch(Exception e){
            System.out.println("Exception");
            throw e;
        }
    }

}