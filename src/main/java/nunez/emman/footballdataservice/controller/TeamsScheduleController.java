package nunez.emman.footballdataservice.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nunez.emman.footballdataservice.dto.ApiTeam;
import nunez.emman.footballdataservice.service.TeamScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

/**
 * @author Emman Nunez
 * @date 1/28/2021
 */

@RestController
@AllArgsConstructor
@RequestMapping("/teams/{teamId}/schedules")
public class TeamsScheduleController {

    private final TeamScheduleService teamScheduleService;

    @GetMapping("/next-game")
    public Flux<ApiTeam> getNextGame(@PathVariable Long teamId) {

        final ApiTeam apiTeam = teamScheduleService.getTeamSchedule(teamId);

        return Flux.just(apiTeam);
    }

}
