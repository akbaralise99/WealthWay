package com.WealthWay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WealthWay.Services.GoalService;
import com.WealthWay.model.GoalDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/portfolio")
@RequiredArgsConstructor
public class GoalController {

   @Autowired private  GoalService goalService;

    @PostMapping("/goals/projection")
  //  @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> projectGoal(@RequestBody GoalDto goalDto) {
        double sip = goalService.calculateRequiredSIP(goalDto);
        return ResponseEntity.ok("You need to invest ₹" + Math.round(sip) + "/month to reach ₹" +
            goalDto.getTargetAmount() + " in " + goalDto.getYearsToAchieve() + " years.");
    }

    @GetMapping("/goals/future-value")
 //   @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> futureValue(
            @RequestParam double monthlyInvestment,
            @RequestParam int years) {
        double value = goalService.calculateFutureValue(monthlyInvestment, years);
        return ResponseEntity.ok("Future Value: ₹" + Math.round(value));
    }
}
