package programmers.sort;

/**
 * 선택정렬은 최솟값을 찾아서 가장 왼쪽에 둔다.
 * 3, 1, 5, 2, 4
 *
 * - 대상 범위에서 최소값인 1을 차장서 가장 왼쪽의 3과 바꾼다.
 * --> 1, 3, 5, 2, 4
 *
 * - 1을 제외한 나머지에대해서 최소값 2를 가장 왼쪽의 3과 바꾼다.
 * --> 1, 2, 5, 3, 4
 *
 * - 1, 2 를 제외한 나머지에 대해서 최소값 3을 가장 왼쪽의 5와 바꾼다.
 * --> 1, 2, 3, 5, 4
 *
 * - 1, 2, 3 을 제외 한 나머지에 대해서 최소값 4를 가장 왼쪽의 5와 바꾼다.
 * --> 1, 2, 3, 4, 5
 *
 * 범위가 계속줄어들긴하지만 범위내에서 최소값을 찾기때문에 O(n2) 시간복잡도를
 * 가진다.
 *
 */
public class 선택정렬 {

}
