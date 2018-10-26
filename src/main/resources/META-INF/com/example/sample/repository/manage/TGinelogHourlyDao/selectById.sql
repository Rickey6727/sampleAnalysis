select
  /*%expand*/*
from
  t_ginelog_hourly
where
  type = /* type */'a'
  and
  target_time = /* targetTime */'2010-01-23 12:34:56'
