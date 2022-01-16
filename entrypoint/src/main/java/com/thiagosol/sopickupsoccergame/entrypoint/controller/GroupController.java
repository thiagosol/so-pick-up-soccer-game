package com.thiagosol.sopickupsoccergame.entrypoint.controller;

import com.thiagosol.sopickupsoccergame.core.usecase.group.AddGroupUseCase;
import com.thiagosol.sopickupsoccergame.entrypoint.dto.group.NewGroupDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
@Tag(name = "Grupos", description = "Grupos do futebol.")
public class GroupController {

    private static final Logger LOG = LoggerFactory.getLogger(GroupController.class);
    private final AddGroupUseCase addGroupUseCase;

    public GroupController(AddGroupUseCase addGroupUseCase) {
        this.addGroupUseCase = addGroupUseCase;
    }

    @GetMapping
    public ResponseEntity<String> getAllGroups() {
        LOG.info("Retrieving get all groups");
        return ResponseEntity.ok("Teste");
    }

    @PostMapping
    public ResponseEntity saveGroup(@RequestBody NewGroupDTO newGroupDTO) {
        LOG.info("save group");
        addGroupUseCase.execute(newGroupDTO.toGroup());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
