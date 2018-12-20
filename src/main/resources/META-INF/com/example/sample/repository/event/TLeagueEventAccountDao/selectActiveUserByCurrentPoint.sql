select
    count(distinct account_id)
from
    t_league_event_account
where
    event_id = /*eventId*/1
and
    current_point > 0