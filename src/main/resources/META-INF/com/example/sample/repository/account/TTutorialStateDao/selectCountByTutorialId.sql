SELECT
    count(*)
FROM
    t_tutorial_state
WHERE
    tutorial_id = /*tutorialId*/'1'
AND
    complete_flg = '1'