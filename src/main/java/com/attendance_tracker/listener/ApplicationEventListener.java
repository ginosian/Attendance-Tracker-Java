package com.attendance_tracker.listener;

import com.attendance_tracker.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener {
    private final Logger logger = LoggerFactory.getLogger(ApplicationEventListener.class);

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private CompanyDetailsRepository companyDetailsRepository;

    @Autowired
    Environment environment;

    @EventListener({ContextRefreshedEvent.class})
    public void onContextRefreshedEvent() {
//        final String[] profiles  = environment.getActiveProfiles();
//        if(profiles.length > 0){
//            return;
//        }
//        logger.info("Saving Permissions ...");
//        final List<Permission> permissions = permissionRepository.saveAll(StaticData.createPermissions());
//        logger.debug("Done saving Permissions.");
//
//        logger.info("Saving Roles ...");
//        final List<Role> roles = roleRepository.saveAll(
//                StaticData.createRoles()
//                        .stream()
//
//                        .peek(role -> role.setPermissions(Sets.newHashSet(permissions)))
//                        .collect(Collectors.toSet()));
//        logger.debug("Done saving Roles.");
//
//        logger.info("Saving Business ...");
//        final Business business = companyRepository.save(MockData.createTestCompany());
//        logger.debug("Done saving Business.");
//
//        logger.info("Saving Employee ...");
//        final Employee employee = MockData.createTestEmployee();
//        employee.setBusiness(business);
//        employeeRepository.save(employee);
//        logger.debug("Done saving Employee.");
//
//        logger.info("Saving Owner ...");
//        ownerRepository.save(MockData.createOwner());
//        logger.debug("Done saving Owner.");
//
//        logger.info("Saving Business Details ...");
//        final BusinessDetails businessDetails = new BusinessDetails();
//        businessDetails.setBusiness(business);
//        companyDetailsRepository.save(businessDetails);
//        logger.debug("Done saving Business Details.");
    }
}