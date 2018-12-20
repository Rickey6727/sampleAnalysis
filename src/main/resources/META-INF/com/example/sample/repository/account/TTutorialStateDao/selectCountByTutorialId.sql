select
    count(*)
from
    t_tutorial_state
where
    tutorial_id = /*tutorialId*/1
and
    complete_flg = 1