select
  /*%expand*/*
from
  t_term_billing_state
where
  account_id = /* accountId */1
  and
  term_type = /* termType */1
