select
  /*%expand*/*
from
  t_code_exchange
where
  exchange_cd = /* exchangeCd */'a'
  and
  target_flg = /* targetFlg */1
