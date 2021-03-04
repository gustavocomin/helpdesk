package com.gustavoc.helpdesk.api.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gustavoc.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}