select
  /*%expand*/*
from
  t_simple_serial_cd
where
  target_id = /* targetId */1
  and
  serial_cd = /* serialCd */'a'
