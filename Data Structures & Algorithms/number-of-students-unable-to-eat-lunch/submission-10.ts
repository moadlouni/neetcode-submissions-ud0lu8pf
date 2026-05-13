class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students: number[], sandwiches: number[]): number {

        let want0: number = 0;
        let want1: number = 0;

        for (const student of students) {
            student == 0 ? want0++ : want1++;
        }
        
        for(const sandwich of sandwiches) {
            if (sandwich == 0 && want0 > 0) {
                want0--;
            } else if (sandwich == 1 && want1 > 0) {
                want1--;
            } else {
                return want0 + want1;
            }
        }
        
        return 0;
    }
}
