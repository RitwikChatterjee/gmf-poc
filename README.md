# gmf-poc
GMF Proof-of-Concept for MA mobility

Branches created:

1. *(2016-03-23)* **b01-check-cust-id** : To check customer id is the same as the one for which the token was issued
2. *(2016-04-04)* **b02-add-tm**: Added traffic management capabilities to the flow
3. *(2016-04-06)* **b03-check-client-id**: Added verification that the token was issued to the same client that is presenting the token. According to the discussion [here](https://community.apigee.com/questions/21504/how-do-i-validate-access-token-was-issued-to-the-c.html), this step might not be required. Have also added some comments to the proxy code.