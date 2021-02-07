package nunez.emman.footballdataservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import nunez.emman.footballdataservice.dto.ApiTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Emman Nunez
 * @date 2/2/2021
 */
@Service
@Slf4j
public class TeamScheduleService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${rest-api.api-football-service-adapter.url}")
    private String apiFootballServiceAdapterUrl;


    @HystrixCommand(fallbackMethod = "getFallbackTeamSchedule")
    public ApiTeam getTeamSchedule(final Long teamId) {
        final ApiTeam apiTeam = restTemplate.getForObject(apiFootballServiceAdapterUrl + "/teams/" + teamId, ApiTeam.class);
        return apiTeam;
    }

}
