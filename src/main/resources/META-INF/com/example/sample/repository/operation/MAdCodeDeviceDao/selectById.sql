select
  /*%expand*/*
from
  m_ad_code_device
where
  device_type = /* deviceType */1
  and
  ad_code = /* adCode */'a'
