select
  /*%expand*/*
from
  m_billing_name_country
where
  billing_id = /* billingId */1
  and
  country_cd = /* countryCd */1
