select
  /*%expand*/*
from
  t_ginelog_daily
where
  type = /* type */'a'
  and
  target_date = /* targetDate */'2010-01-23'
