package nunez.emman.footballdataservice.controller;

import lombok.AllArgsConstructor;
import nunez.emman.footballdataservice.dto.ApiTeam;
import nunez.emman.footballdataservice.service.TeamScheduleService;
import nunez.emman.footballdataservice.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Emman Nunez
 * @date 1/28/2021
 */

@RestController
@AllArgsConstructor
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/{teamId}")
    public Mono<ApiTeam> getNextGame(@PathVariable Long teamId) {
        final ApiTeam apiTeam = teamService.getTeam(teamId);
        return Mono.just(apiTeam);
    }

}
