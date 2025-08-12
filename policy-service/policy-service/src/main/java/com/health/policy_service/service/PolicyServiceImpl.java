package com.health.policy_service.service;

import com.health.policy_service.entity.Policy;
import com.health.policy_service.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public Policy createPolicy(Policy policy) {
        // Agar startDate null ho to current date set karo
        if (policy.getStartDate() == null) {
            policy.setStartDate(LocalDate.now());
        }
        // Agar endDate null ho aur duration positive ho to calculate karo
        if (policy.getEndDate() == null && policy.getDuration() > 0) {
            policy.setEndDate(policy.getStartDate().plusMonths(policy.getDuration()));
        }
        if (policy.getStatus() == null || policy.getStatus().isEmpty()) {
            policy.setStatus("ACTIVE");
        }
        return policyRepository.save(policy);
    }
}
