package com.beskilled.onlinebanking.repo;

import com.beskilled.onlinebanking.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepo extends JpaRepository<Meeting, Long> {
}
