select
  /*%expand*/*
from
  m_event
where
  event_id = /* eventId */1
  and
  incident_type = /* incidentType */1
