SELECT account_id 
FROM t_clothes_own_/*# i */
WHERE clothes_id = /* clothesId */'1'
GROUP BY account_id
