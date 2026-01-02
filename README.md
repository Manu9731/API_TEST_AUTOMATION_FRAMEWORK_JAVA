# Test Plan – Login & User Management API

## 1. Introduction
This test plan describes the testing approach for **Login and User Management APIs**. The goal is to validate that authentication and user profile management functionalities work correctly and reliably.

## 2. Objective
- Verify login and authentication APIs
- Validate user profile retrieval and update APIs
- Ensure correct responses, status codes, and data integrity
- Confirm test execution and reporting via CI/CD integration

## 3. Scope
### In Scope
- API testing for Login functionality
- API testing for User Profile Management
- Automated test execution
- CI/CD test execution and reporting

### Out of Scope
- UI testing
- Performance and load testing
- Security and penetration testing

## 4. APIs Under Test
- **Login API**
- **Get Profile API**
- **Update Profile API**
- **Update Single Profile Field API**

## 5. Test Approach
- Black-box API testing
- Automated tests using REST client framework
- Validation of:
  - HTTP status codes
  - Response body
  - Error handling
  - Authorization

## 6. Test Environment
- Environment: Test / Staging
- API Type: REST
- Authentication: Token-based (JWT)
- Tools: Postman / Rest Assured / Supertest (as applicable)

## 7. Test Cases
### Login API
- Verify login with valid credentials
- Verify login with invalid credentials
- Verify error message for missing fields

### Get Profile API
- Verify profile details are returned for valid token
- Verify unauthorized access with invalid token

### Update Profile API
- Verify full profile update with valid data
- Verify validation errors for invalid input

### Update Single Profile Field API
- Verify updating a single profile field
- Verify unchanged fields remain intact

## 8. Entry Criteria
- APIs are deployed and accessible
- Test data is available
- CI/CD pipeline is configured

## 9. Exit Criteria
- All planned test cases executed
- All critical test cases passed
- Test reports generated successfully

## 10. Test Artifacts
- Test Plan
- Automated Test Scripts
- Test Execution Report
- CI/CD Pipeline Logs

## 11. Test Reports
- Test reports will include:
  - Passed test cases
  - Failed test cases (if any)
  - Execution time
- Reports are generated automatically after CI/CD run

## 12. CI/CD Integration
- Automated tests triggered on:
  - Code commit
  - Pull request
- Test execution integrated with CI/CD pipeline
- Pipeline fails if critical tests fail

## 13. Roles and Responsibilities
| Role | Responsibility |
|------|----------------|
| Tester / SDET | Test design, automation, reporting |
| Developer | Fixing defects |
| DevOps | CI/CD maintenance |

## 14. Approval
| Name | Role | Signature |
|------|------|-----------|
| | | |

