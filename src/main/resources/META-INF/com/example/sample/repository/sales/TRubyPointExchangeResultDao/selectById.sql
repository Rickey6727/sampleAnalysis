select
  /*%expand*/*
from
  t_ruby_point_exchange_result
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
  and
  exchange_id = /* exchangeId */1
