select
  event_id, start_date, end_date, base_probability, helper_facility_id, update_date, start_tutorial_id, end_tutorial_id, reward_tutorial_id
from
  m_league_event
where
  event_id = /* eventId */'1'
