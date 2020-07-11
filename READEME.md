### Commands
1) To run the build task
`gradle <task-name`

2) Run multiple tasks
`gradle <task1> <task2>`

3) See the deplendicies
`gradle -q dependencies`

4) See all the dependencies for specific implementation
`gradle -q dependencies --configuration compileClasspath`

5) Refresh the repositories cache
`gradle --refresh-dependencies`
