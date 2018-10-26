select
  /*%expand*/*
from
  m_term_billing_days
where
  term_type = /* termType */1
  and
  day = /* day */1
