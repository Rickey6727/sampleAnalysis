SELECT
  event_id, max_stage, start_date, end_date, lucky_gacha_id, event_shop_id, start_tutorial_id, end_tutorial_id, del_flg, create_date, update_date
FROM
  m_capture_event
WHERE
  event_id = /* eventId */'1'
