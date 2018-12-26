SELECT
    count(DISTINCT account_id)
FROM
    t_login_history
WHERE
    login_date::text >= /*startDate*/'0000-00-00 00:00:00'
AND
    login_date::text < /*endDate*/'0000-00-00 00:00:00'