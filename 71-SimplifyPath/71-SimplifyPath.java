// Last updated: 09/07/2026, 10:08:52
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String p : parts) {
            if (p.equals("") || p.equals(".")) continue;

            if (p.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(p);
            }
        }

        return "/" + String.join("/", stack);
    }
}